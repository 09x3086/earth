package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.Data;

/**
 * Speed class.
 *
 * @author 09x3086
 */
@Data
public class Speed {

  private BigDecimal value;

  public Speed(Space space, Time time) {
    this.value = space.getValue().divide(time.getValue(), RoundingMode.HALF_UP);
  }
}
