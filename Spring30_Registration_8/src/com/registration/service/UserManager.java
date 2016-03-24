package com.registration.service;

import com.registration.model.User;

public interface UserManager {

	public abstract boolean exists(User u);

	public abstract void add(User u);

}