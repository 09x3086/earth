package model;

import java.math.BigDecimal;
import lombok.Data;

/**
 * Time class.
 *
 * @author 09x3086
 */
@Data
public class Time {

  BigDecimal value;

  public Time(Space space, Time time) {
    this.value = space.getValue().divide(time.getValue(), BigDecimal.ROUND_HALF_UP);
  }
}
