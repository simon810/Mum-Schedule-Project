package edu.mum.mumsched.service;

import edu.mum.mumsched.dto.BlockDto;

import java.util.List;

public interface BlockService {
    BlockDto insertBlock(BlockDto blockDto);
    List<BlockDto> getAllBlocks();
    BlockDto updateBlock(BlockDto blockDto);
}
