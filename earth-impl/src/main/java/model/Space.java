package model;

import java.math.BigDecimal;
import lombok.Data;

/**
 * Space class.
 *
 * @author 09x3086
 */
@Data
public class Space {

  private BigDecimal value;

  public Space(Speed speed, Time time) {
    this.value = speed.getValue().multiply(time.getValue());
  }
}
