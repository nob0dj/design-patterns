package com.sh.template.callback.solution1;

import java.io.BufferedReader;
import java.io.IOException;

public interface ICalcCallback {
	int doCalc(BufferedReader br) throws IOException;
}
