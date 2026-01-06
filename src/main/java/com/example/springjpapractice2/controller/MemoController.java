package com.example.springjpapractice2.controller;

import com.example.springjpapractice2.dto.MemoRequestDto;
import com.example.springjpapractice2.dto.MemoResponseDto;
import com.example.springjpapractice2.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @PostMapping("/memos")
    public ResponseEntity<MemoResponseDto> save(@RequestBody MemoRequestDto dto) {
        return ResponseEntity.ok(memoService.save(dto));
    }

    @GetMapping("/memos")
    public ResponseEntity<List<MemoResponseDto>> findAll() {
        return ResponseEntity.ok(memoService.findAll());
    }

    @GetMapping("/memos/{id}")
    public ResponseEntity<MemoResponseDto> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(memoService.findById(id));
    }
}
