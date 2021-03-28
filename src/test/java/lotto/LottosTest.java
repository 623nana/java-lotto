package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import lotto.domain.Amount;
import lotto.domain.Lottos;
import lotto.domain.ManualNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottosTest {

  @Test
  @DisplayName("[Lottos] 입력한 가격만큼 로또 생성 되는지 테스트")
  void createLottosTest() {
    Amount amount = new Amount(14000, 0);
    ManualNumbers manualNumbers = new ManualNumbers(new ArrayList<>());
    Lottos lottos = new Lottos(amount, manualNumbers);

    int size = lottos.getLottos().size();

    assertThat(size).isEqualTo(14);
  }
}
