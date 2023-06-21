package ru.sber.proxies;

import org.springframework.stereotype.Component;
import ru.sber.exception.TransferByPhoneException;

import java.math.BigDecimal;

@Component
public class TransferByPhoneAppProxy implements TransferByPhoneInterfaceProxy {
    @Override
    public void TransferByPhone(String phone, BigDecimal sum) throws TransferByPhoneException {
        if (sum.compareTo(BigDecimal.valueOf(0)) > 0) {
            System.out.println("Перевод по телефону " + phone + " на сумму " + sum + "руб.");
            return;
        }
        throw new TransferByPhoneException("Попытка оптправить отрицательное значение - " + sum + " на телефон " + phone);
    }
}
