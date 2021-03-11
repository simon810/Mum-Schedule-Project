package edu.mum.mumsched.service.serviceImpl;


import edu.mum.mumsched.domain.Block;
import edu.mum.mumsched.dto.BlockDto;
import edu.mum.mumsched.repository.BlockRepository;
import edu.mum.mumsched.service.BlockService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BlockServiceImpl implements BlockService {

    private BlockRepository blockRepository;
    private ModelMapper modelMapper;

    public BlockServiceImpl(BlockRepository blockRepository, ModelMapper modelMapper) {
        this.blockRepository = blockRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public BlockDto insertBlock(BlockDto blockDto) {
        Block blockToSave=modelMapper.map(blockDto,Block.class);
        Block blockSaved=blockRepository.save(blockToSave);

        return modelMapper.map(blockSaved, BlockDto.class);
    }

    @Override
    public List<BlockDto> getAllBlocks() {
        return  blockRepository.findAll().stream()
                .map(block -> modelMapper.map(block,BlockDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public BlockDto updateBlock(BlockDto blockDto) {
        Block blockToSave=modelMapper.map(blockDto,Block.class);
        Block blockSaved=blockRepository.save(blockToSave);

        return modelMapper.map(blockSaved, BlockDto.class);
    }
}
