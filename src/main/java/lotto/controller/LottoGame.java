package lotto.controller;

import java.util.List;
import lotto.domain.Amount;
import lotto.domain.LottoNumbers;
import lotto.domain.LottoStore;
import lotto.view.InputView;
import lotto.view.ResultView;

public class LottoGame {

  public void run() {
    Amount amount = new Amount(InputView.inputPriceOfBuy());
    List<LottoNumbers> lottos = LottoStore.generateLottos(amount.getAmount());

    ResultView.showAmountOfLotto(amount.getAmount());
    ResultView.showLottoNumbers(lottos);
  }
}
