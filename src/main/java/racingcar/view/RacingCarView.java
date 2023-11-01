package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class RacingCarView {
    public String getCarsNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputCarNames = Console.readLine();
        System.out.println(inputCarNames);

        return inputCarNames;
    }

    public int getNumberOfAttempts(){
        System.out.println("시도할 회수는 몇회인가요?");
        int numberOfAttempts = Integer.parseInt(Console.readLine());
        System.out.println(numberOfAttempts);

        return numberOfAttempts;
    }
}
