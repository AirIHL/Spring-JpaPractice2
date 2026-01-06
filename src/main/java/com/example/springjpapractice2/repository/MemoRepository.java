package com.example.springjpapractice2.repository;

import com.example.springjpapractice2.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
