package edu.mum.mumsched.controller;

import edu.mum.mumsched.dto.BlockDto;
import edu.mum.mumsched.service.BlockService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/block")
public class BlockController {

    private BlockService blockService;

    public BlockController(BlockService blockService) {
        this.blockService = blockService;
    }


    @GetMapping("/blocks")
    @ResponseStatus(HttpStatus.OK)
    public List<BlockDto> getAllBlocks() {
        return blockService.getAllBlocks();
    }


    @PostMapping("/block")
    @ResponseStatus(HttpStatus.CREATED)
    public BlockDto insertBlock(@RequestBody BlockDto blockDto) {
        return blockService.insertBlock(blockDto);
    }
}
