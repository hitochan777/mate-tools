package se.lth.cs.srl.preprocessor;

import is2.data.SentenceData09;
import is2.lemmatizer.LemmatizerInterface;
import is2.tools.Tool;

public class SimpleChineseLemmatizer implements LemmatizerInterface, Tool {

	@Override
	public String[] getLemmas(String[] forms) {
		if(true)
			throw new Error("This method should not be trusted. Fix the root token in accordance with is2.lemmatizer.Lemmatizer before using it.");
		String[] ret=new String[forms.length]; //TODO, make sure to deal with the root token properly.
		ret[0]="<root>";
		for(int i=1;i<forms.length;++i)
			ret[i]=forms[i];
		return ret;
	}

	@Override
	public SentenceData09 apply(SentenceData09 instance) {
		for(int i=0;i<instance.forms.length;++i)
			instance.lemmas[i]=instance.forms[i];
		
		return instance;
	}

}