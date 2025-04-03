package com.dev.lesson11.repository;

import com.dev.lesson11.entity.NVC_account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NVC_accountRepository extends JpaRepository<NVC_account, Long> {

    // Tìm kiếm tài khoản theo tên người dùng
    Optional<NVC_account> findByUser(String user);

    // Kiểm tra xem email đã tồn tại chưa
    boolean existsByEmail(String email);
}
