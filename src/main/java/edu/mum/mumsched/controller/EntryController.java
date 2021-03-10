package edu.mum.mumsched.controller;

import edu.mum.mumsched.dto.EntryDto;
import edu.mum.mumsched.service.EntryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

    private EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }


    @GetMapping("/entries")
    @ResponseStatus(HttpStatus.OK)
    public List<EntryDto> getAllEntries() {
        return entryService.getAllEntries();
    }

    @GetMapping("/entry")
    @ResponseStatus(HttpStatus.OK)
    public EntryDto getEntryById(@RequestParam Long id) {
        return entryService.getEntryById(id);
    }

    @PostMapping("/entity")
    @ResponseStatus(HttpStatus.CREATED)
    public EntryDto insertEntry(@RequestBody EntryDto entryDto) {
        return entryService.insertEntry(entryDto);
    }

    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEntity(@PathVariable Long id) {
        entryService.deleteEntry(id);

    }

    @PatchMapping("/entity")
    @ResponseStatus(HttpStatus.OK)
    public EntryDto updateEntry(@RequestBody EntryDto entryDto) {
        return entryService.updateEntry(entryDto);
    }

}
