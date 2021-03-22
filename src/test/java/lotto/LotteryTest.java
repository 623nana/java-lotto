package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lotto.domain.HitNumber;
import lotto.domain.Lottery;
import lotto.domain.LottoNumbers;
import lotto.domain.Number;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LotteryTest {

  @Test
  @DisplayName("[Lottery] 당첨 번호 갯수 count 테스트")
  void countHitTest() {
    List<Number> numbers = IntStream.rangeClosed(1, 6)
        .mapToObj(Number::new)
        .collect(Collectors.toList());
    LottoNumbers lottoNumbers = new LottoNumbers(numbers);
    HitNumber hitNumber = new HitNumber("1, 2, 3, 4, 5, 7");
    Lottery lottery = new Lottery(hitNumber);

    int hitCount = lottery.countHit(lottoNumbers);

    assertThat(hitCount).isEqualTo(5);
  }
}
