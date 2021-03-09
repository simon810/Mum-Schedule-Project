package edu.mum.mumsched.service;

import edu.mum.mumsched.dto.EntryDto;

import java.util.List;

public interface EntryService {
    EntryDto getEntryById(Long id);
    List<EntryDto> getAllEntries();
    EntryDto insertEntry(EntryDto entryDto);
    void deleteEntry(Long id);
    EntryDto updateEntry(EntryDto entryDto);
}
