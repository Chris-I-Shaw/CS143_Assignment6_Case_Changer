package asignment06;

import java.util.ArrayList;
import java.util.Arrays;

public class CaseChangerDemo {

	public static void main(String[] args) {
		ArrayList<String> strAryList = new ArrayList<>(
				Arrays.asList(
						"aLaBaMa", 
						"aLaSkA",
						"aRiZoNa",
						"aRkAnSaS", 
						"mAiNe",
						"mArYlAnD",
						"mAsSaChUsEtTs",
						"mIcHiGaN",
						"mInNeSoTa",
						"mIsSiSsIpPi",
						"mIsSoUrI",
						"mOnTaNa"
				)
		);

		System.out.println(CaseChanger.mangleToUpperCase( strAryList ));
		System.out.println(CaseChanger.mangleToLowerCase( strAryList ));
		System.out.println(CaseChanger.mangleCapitalize( strAryList ));
		System.out.println(CaseChanger.mangleToUpperLowerCase( strAryList ));
                System.out.println(strAryList);
		
		
	}
}
