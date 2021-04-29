/*
 * Copyright (c) 2021 REPLACE_CUSTOMER_NAME. All rights reserved.
 *
 * This file is part of Github-with-CI-3.
 *
 * Github-with-CI-3 project and associated code cannot be copied
 * and/or distributed without a written permission of REPLACE_CUSTOMER_NAME,
 * and/or its subsidiaries.
 */
package com.test.security.db.service;

import org.springframework.stereotype.Service;

import com.test.security.db.repository.UserEntityRepository;


/**
 * Default implementation for {@link org.springframework.security.core.userdetails.UserDetailsService}.
 *
 * @author Mahalingam Iyer
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl extends AbstractUserDetailsService {

    /**
     * Constructor.
     *
     * @param userEntityRepository
     *         Repository implementation of type {@link UserEntityRepository}.
     */
    public UserDetailsServiceImpl(final UserEntityRepository userEntityRepository) {
        super(userEntityRepository);
    }
}
