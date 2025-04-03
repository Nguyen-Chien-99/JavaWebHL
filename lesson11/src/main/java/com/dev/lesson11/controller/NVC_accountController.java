package com.dev.lesson11.controller;

import com.dev.lesson11.entity.NVC_account;
import com.dev.lesson11.service.NVC_accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/NVC_account")
public class NVC_accountController {

    @Autowired
    private NVC_accountService nvc_accountService;

    // Lấy tất cả tài khoản
    @GetMapping
    public List<NVC_account> getAllNVC_accounts() {
        return nvc_accountService.getAllNVC_accounts();
    }

    // Lấy tài khoản theo ID
    @GetMapping("/{id}")
    public ResponseEntity<NVC_account> getNVC_accountById(@PathVariable Long id) {
        return nvc_accountService.getNVC_accountById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Tạo mới tài khoản
    @PostMapping
    public NVC_account createNVC_account(@RequestBody NVC_account nvc_account) {
        return nvc_accountService.saveNVC_account(nvc_account);
    }

    // Cập nhật tài khoản
    @PutMapping("/edit/{id}")
    public ResponseEntity<NVC_account> updateNVC_account(@PathVariable Long id, @RequestBody NVC_account nvc_account) {
        return nvc_accountService.updateNVC_account(id, nvc_account)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Xóa tài khoản
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteNVC_account(@PathVariable Long id) {
        if (nvc_accountService.deleteNVC_account(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
