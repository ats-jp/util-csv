package jp.ats.util.csv;

/**
 * @author 千葉 哲嗣
 */
public interface CSVListener {

	void receiveNextChar(char next);

	void receiveStartColumn();

	void receiveColumnBody(char next);

	void receiveEndColumn();

	void receiveNewLine(String separator);

	void receiveEndCSV();

	void receiveError(String message);
}
