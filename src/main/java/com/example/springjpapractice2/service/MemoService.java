package com.example.springjpapractice2.service;

import com.example.springjpapractice2.dto.MemoRequestDto;
import com.example.springjpapractice2.dto.MemoResponseDto;
import com.example.springjpapractice2.entity.Memo;
import com.example.springjpapractice2.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor

public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional
    public MemoResponseDto save(MemoRequestDto dto) {
        Memo memo = new Memo(dto.getTitle(), dto.getContent());
        Memo savedMemo = memoRepository.save(memo);
        return new MemoResponseDto(savedMemo.getId(), savedMemo.getTitle(), savedMemo.getContent());
    }
}
