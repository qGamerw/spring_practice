package ru.sber.repository;

import ru.sber.model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Интерфейс для взаимодействия с корзиной
 */
public interface BasketRepository {
    /**
     * Добавляет товар
     *
     * @param idClient  индикатор клитента
     * @param idProduct индикатор товара
     * @param count     количество
     * @return результат
     */
    boolean add(long idClient, long idProduct, int count);

    /**
     * Редактирует количество товара
     *
     * @param idCart    индикатор клиента
     * @param idProduct индикатор товара
     * @param count     количество
     * @return результат
     */
    boolean update(long idCart, long idProduct, int count);

    /**
     * Удаляет товар
     *
     * @param idClient  индикатор клиента
     * @param idProduct индикатор товара
     * @return результат
     */
    boolean delete(long idClient, long idProduct);

    /**
     * Получает сумму для оплаты
     *
     * @param idClient индикатор клиента
     * @return результат
     */
    BigDecimal getPrice(long idClient);

    /**
     * Проверяет существуют ли продукты в корзине
     *
     * @param idClient индикатор клиента
     * @return результат
     */
    boolean isBasket(long idClient);

    /**
     * Проверяет хватает ли товара на складе
     *
     * @param idClient индикатор клиента
     * @return результат
     */
    boolean isCountProduct(long idClient);

    /**
     * Удаляет продукты в корзине и на складе
     *
     * @param idClient индикатор клиента
     * @return результат
     */
    boolean removeProductBasket(long idClient);
    Optional<Long> getIdCard(long idClient);
}