package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Test
    public void 아이템_조회() throws Exception {
        //given
        Item item = new Item();
        item.setName("hello");
        itemService.saveItem(item);

        //when
        Item findItem = itemService.findOne(item.getId());

        //then
        Assertions.assertThat(findItem).isEqualTo(item);
    }


}