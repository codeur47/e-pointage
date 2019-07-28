package com.yorosoft.epointage.services.Implementation;

import com.yorosoft.epointage.repositories.PrivilegeRepository;
import com.yorosoft.epointage.services.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Override
    public boolean checkPrivilegeExists(String name) {
        if (privilegeRepository.findByName(name) != null)
            return true;
        else
            return false;

    }
}
