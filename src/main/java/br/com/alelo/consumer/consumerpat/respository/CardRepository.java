package br.com.alelo.consumer.consumerpat.respository;

import br.com.alelo.consumer.consumerpat.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CardRepository extends JpaRepository<Card, Integer> {
        @Query(nativeQuery = true, value = "select * from Card where  NUMBER = ? ")
        Card findByNumber(int cardNumber);
}
