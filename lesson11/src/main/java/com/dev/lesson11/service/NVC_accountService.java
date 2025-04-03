package com.dev.lesson11.service;

import com.dev.lesson11.entity.NVC_account;
import com.dev.lesson11.repository.NVC_accountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NVC_accountService {
    @Autowired
    private NVC_accountRepository nvc_accountRepository;

    public List<NVC_account> getAllNVC_accounts() {
        return nvc_accountRepository.findAll();
    }

    public Optional<NVC_account> getNVC_accountById(Long id) {
        return nvc_accountRepository.findById(id);
    }

    public NVC_account saveNVC_account(NVC_account nvc_account) {
        return nvc_accountRepository.save(nvc_account);
    }

    public Optional<NVC_account> updateNVC_account(Long id, NVC_account newData) {
        return nvc_accountRepository.findById(id).map(existingAccount -> {
            existingAccount.setUser(newData.getUser());
            existingAccount.setPassword(newData.getPassword());
            existingAccount.setName(newData.getName());
            existingAccount.setEmail(newData.getEmail());
            existingAccount.setPhone(newData.getPhone());
            existingAccount.setAddress(newData.getAddress());
            existingAccount.setStatus(newData.getStatus());

            return nvc_accountRepository.save(existingAccount);
        });
    }

    public boolean deleteNVC_account(Long id) {
        if (nvc_accountRepository.existsById(id)) {
            nvc_accountRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
