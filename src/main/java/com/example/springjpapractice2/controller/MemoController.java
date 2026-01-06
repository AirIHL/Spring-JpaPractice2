package com.example.springjpapractice2.controller;

import com.example.springjpapractice2.dto.MemoRequestDto;
import com.example.springjpapractice2.dto.MemoResponseDto;
import com.example.springjpapractice2.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @PostMapping("/memos")
    public ResponseEntity<MemoResponseDto> save(@RequestBody MemoRequestDto dto) {
        return ResponseEntity.ok(memoService.save(dto));
    }
}
