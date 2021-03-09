package edu.mum.mumsched.service.serviceImpl;

import edu.mum.mumsched.domain.Entry;
import edu.mum.mumsched.dto.EntryDto;
import edu.mum.mumsched.repository.EntryRepository;
import edu.mum.mumsched.service.EntryService;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class EntryServiceImpl implements EntryService {

    private EntryRepository entryRepository;
    private ModelMapper modelMapper;

    public EntryServiceImpl(EntryRepository entryRepository, ModelMapper modelMapper) {
        this.entryRepository = entryRepository;
        this.modelMapper = modelMapper;
    }



    @Override
    public EntryDto getEntryById(Long id) {
        Entry entry= entryRepository.findById(id).orElse(null);
        if (entry==null) throw new RuntimeException("Entry Not Found!");

        return modelMapper.map(entry, EntryDto.class);
    }

    @Override
    public List<EntryDto> getAllEntries() {
        return  entryRepository.findAll().stream()
                .map(entry -> modelMapper.map(entry,EntryDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public EntryDto insertEntry(EntryDto entryDto) {
        Entry entryToSave=modelMapper.map(entryDto,Entry.class);
        Entry entrySaved=entryRepository.save(entryToSave);

        return modelMapper.map(entrySaved,EntryDto.class);
    }

    @Override
    public void deleteEntry(Long id) {
        entryRepository.deleteById(id);
    }

    @Override
    public EntryDto updateEntry(EntryDto entryDto) {
        Entry entryToUpdate=modelMapper.map(entryDto,Entry.class);
        return modelMapper.map(entryRepository.save(entryToUpdate),EntryDto.class);
    }
}
