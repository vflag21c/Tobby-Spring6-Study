package tobbyspring.hellospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tobbyspring.hellospring.data.OrderRepository;
import tobbyspring.hellospring.order.Order;

import java.math.BigDecimal;

public class DataClient {
    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(DataConfig.class);

        OrderRepository repository = beanFactory.getBean(OrderRepository.class);
        Order order = new Order("100", BigDecimal.TEN);

        repository.save(order);

        System.out.println("order = " + order);

        Order order2 = new Order("100", BigDecimal.TEN);
        repository.save(order2);
    }
}
