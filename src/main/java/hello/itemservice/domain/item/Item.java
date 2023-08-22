package hello.itemservice.domain.item;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 10000원이상")
public class Item {
//    @NotNull(groups = UpdateCheck.class)
    private Long id;
//    @NotBlank(groups = {UpdateCheck.class, SaveCheck.class})
    private String itemName;
//    @NotNull(groups = {UpdateCheck.class, SaveCheck.class})
//    @Range(min = 1000, max = 1000000, groups = {UpdateCheck.class, SaveCheck.class})
    private Integer price;
//    @NotNull(groups = {UpdateCheck.class, SaveCheck.class})
//    @Max(value = 9999, groups = SaveCheck.class)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}
