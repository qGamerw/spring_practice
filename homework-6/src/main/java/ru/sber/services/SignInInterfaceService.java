package ru.sber.services;

import ru.sber.model.User;

import java.util.List;

/**
 * Интерфейс для входа и регистрации пользователей
 */
public interface SignInInterfaceService {
    /**
     * Добавляем зарегистрированного пользователя
     */
    void addUser(User user);

    /**
     * Проверяем зарегистрирован ли пользователь
     */
    void isUser(User user);

    /**
     * Получаем список зарегистрированных пользователей
     */
    List<User> getUsers();
}
