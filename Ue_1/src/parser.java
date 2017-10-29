import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;
public class parser {

	public String parser(String str) {
		// TODO Auto-generated constructor stub
		ArrayList<String> lst = new ArrayList<String>();
		
	    String xmlString = str;

	    Matcher matcher = Pattern.compile("<TITLE>(.+?)</TITLE>").matcher(xmlString);
	    while (matcher.find()) {
	    	lst.add(matcher.group(1));
	        System.out.println(matcher.group(1) + " " );
	    }
		System.out.println(lst.size());
		return "";
	}
	
	public static void main(String[] args) throws Exception {

		String str= "<MainTag><element><tag1>Key1</tag1><tag2>"
				+ "Not intrested</tag2><tag3>Value1</tag3>"
				+ "</element><element><tag1>Key2</tag1>"
				+ "<tag2>Not intrested</tag2></element><element><tag1>Key3"
				+ "</tag1><tag2>Not intrested</tag2><tag3>Value3</tag3>"
				+ "</element></MainTag>";
		
		String str2= "<?xml version=\"1.0\"?>\r\n" + 
				"<LEWIS>\r\n" + 
				"<REUTERS TOPICS=\"YES\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5544\" NEWID=\"1\">\r\n" + 
				"<DATE>26-FEB-1987 15:01:01.79</DATE>\r\n" + 
				"<TOPICS><D>cocoa</D></TOPICS>\r\n" + 
				"<PLACES><D>el-salvador</D><D>usa</D><D>uruguay</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"C T\r\n" + 
				"f0704reute\r\n" + 
				"u f BC-BAHIA-COCOA-REVIEW   02-26 0105</UNKNOWN>\r\n" + 
				"<TEXT>\r\n" + 
				"<TITLE>BAHIA COCOA REVIEW</TITLE>\r\n" + 
				"<DATELINE>    SALVADOR, Feb 26 - </DATELINE><BODY>Showers continued throughout the week in\r\n" + 
				"the Bahia cocoa zone, alleviating the drought since early\r\n" + 
				"January and improving prospects for the coming temporao,\r\n" + 
				"although normal humidity levels have not been restored,\r\n" + 
				"Comissaria Smith said in its weekly review.\r\n" + 
				"    The dry period means the temporao will be late this year.\r\n" + 
				"    Arrivals for the week ended February 22 were 155,221 bags\r\n" + 
				"of 60 kilos making a cumulative total for the season of 5.93\r\n" + 
				"mln against 5.81 at the same stage last year. Again it seems\r\n" + 
				"that cocoa delivered earlier on consignment was included in the\r\n" + 
				"arrivals figures.\r\n" + 
				"    Comissaria Smith said there is still some doubt as to how\r\n" + 
				"much old crop cocoa is still available as harvesting has\r\n" + 
				"practically come to an end. With total Bahia crop estimates\r\n" + 
				"around 6.4 mln bags and sales standing at almost 6.2 mln there\r\n" + 
				"are a few hundred thousand bags still in the hands of farmers,\r\n" + 
				"middlemen, exporters and processors.\r\n" + 
				"    There are doubts as to how much of this cocoa would be fit\r\n" + 
				"for export as shippers are now experiencing dificulties in\r\n" + 
				"obtaining +Bahia superior+ certificates.\r\n" + 
				"    In view of the lower quality over recent weeks farmers have\r\n" + 
				"sold a good part of their cocoa held on consignment.\r\n" + 
				"    Comissaria Smith said spot bean prices rose to 340 to 350\r\n" + 
				"cruzados per arroba of 15 kilos.\r\n" + 
				"    Bean shippers were reluctant to offer nearby shipment and\r\n" + 
				"only limited sales were booked for March shipment at 1,750 to\r\n" + 
				"1,780 dlrs per tonne to ports to be named.\r\n" + 
				"    New crop sales were also light and all to open ports with\r\n" + 
				"June/July going at 1,850 and 1,880 dlrs and at 35 and 45 dlrs\r\n" + 
				"under New York july, Aug/Sept at 1,870, 1,875 and 1,880 dlrs\r\n" + 
				"per tonne FOB.\r\n" + 
				"    Routine sales of butter were made. March/April sold at\r\n" + 
				"4,340, 4,345 and 4,350 dlrs.\r\n" + 
				"    April/May butter went at 2.27 times New York May, June/July\r\n" + 
				"at 4,400 and 4,415 dlrs, Aug/Sept at 4,351 to 4,450 dlrs and at\r\n" + 
				"2.27 and 2.28 times New York Sept and Oct/Dec at 4,480 dlrs and\r\n" + 
				"2.27 times New York Dec, Comissaria Smith said.\r\n" + 
				"    Destinations were the U.S., Covertible currency areas,\r\n" + 
				"Uruguay and open ports.\r\n" + 
				"    Cake sales were registered at 785 to 995 dlrs for\r\n" + 
				"March/April, 785 dlrs for May, 753 dlrs for Aug and 0.39 times\r\n" + 
				"New York Dec for Oct/Dec.\r\n" + 
				"    Buyers were the U.S., Argentina, Uruguay and convertible\r\n" + 
				"currency areas.\r\n" + 
				"    Liquor sales were limited with March/April selling at 2,325\r\n" + 
				"and 2,380 dlrs, June/July at 2,375 dlrs and at 1.25 times New\r\n" + 
				"York July, Aug/Sept at 2,400 dlrs and at 1.25 times New York\r\n" + 
				"Sept and Oct/Dec at 1.25 times New York Dec, Comissaria Smith\r\n" + 
				"said.\r\n" + 
				"    Total Bahia sales are currently estimated at 6.13 mln bags\r\n" + 
				"against the 1986/87 crop and 1.06 mln bags against the 1987/88\r\n" + 
				"crop.\r\n" + 
				"    Final figures for the period to February 28 are expected to\r\n" + 
				"be published by the Brazilian Cocoa Trade Commission after\r\n" + 
				"carnival which ends midday on February 27.\r\n" + 
				" Reuter\r\n" + 
				"</BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"NO\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5545\" NEWID=\"2\">\r\n" + 
				"<DATE>26-FEB-1987 15:02:20.00</DATE>\r\n" + 
				"<TOPICS></TOPICS>\r\n" + 
				"<PLACES><D>usa</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"F Y\r\n" + 
				"f0708reute\r\n" + 
				"d f BC-STANDARD-OIL-&lt;SRD>-TO   02-26 0082</UNKNOWN>\r\n" + 
				"<TEXT>\r\n" + 
				"<TITLE>STANDARD OIL &lt;SRD> TO FORM FINANCIAL UNIT</TITLE>\r\n" + 
				"<DATELINE>    CLEVELAND, Feb 26 - </DATELINE><BODY>Standard Oil Co and BP North America\r\n" + 
				"Inc said they plan to form a venture to manage the money market\r\n" + 
				"borrowing and investment activities of both companies.\r\n" + 
				"    BP North America is a subsidiary of British Petroleum Co\r\n" + 
				"Plc &lt;BP>, which also owns a 55 pct interest in Standard Oil.\r\n" + 
				"    The venture will be called BP/Standard Financial Trading\r\n" + 
				"and will be operated by Standard Oil under the oversight of a\r\n" + 
				"joint management committee.\r\n" + 
				"\r\n" + 
				" Reuter\r\n" + 
				"</BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"NO\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5546\" NEWID=\"3\">\r\n" + 
				"<DATE>26-FEB-1987 15:03:27.51</DATE>\r\n" + 
				"<TOPICS></TOPICS>\r\n" + 
				"<PLACES><D>usa</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"F A\r\n" + 
				"f0714reute\r\n" + 
				"d f BC-TEXAS-COMMERCE-BANCSH   02-26 0064</UNKNOWN>\r\n" + 
				"<TEXT>\r\n" + 
				"<TITLE>TEXAS COMMERCE BANCSHARES &lt;TCB> FILES PLAN</TITLE>\r\n" + 
				"<DATELINE>    HOUSTON, Feb 26 - </DATELINE><BODY>Texas Commerce Bancshares Inc's Texas\r\n" + 
				"Commerce Bank-Houston said it filed an application with the\r\n" + 
				"Comptroller of the Currency in an effort to create the largest\r\n" + 
				"banking network in Harris County.\r\n" + 
				"    The bank said the network would link 31 banks having\r\n" + 
				"13.5 billion dlrs in assets and 7.5 billion dlrs in deposits.\r\n" + 
				"       \r\n" + 
				" Reuter\r\n" + 
				"</BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"NO\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5547\" NEWID=\"4\">\r\n" + 
				"<DATE>26-FEB-1987 15:07:13.72</DATE>\r\n" + 
				"<TOPICS></TOPICS>\r\n" + 
				"<PLACES><D>usa</D><D>brazil</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"F\r\n" + 
				"f0725 reute\r\n" + 
				"u f BC-TALKING-POINT/BANKAME   02-26 0105</UNKNOWN>\r\n" + 
				"<TEXT> \r\n" + 
				"<TITLE>TALKING POINT/BANKAMERICA &lt;BAC> EQUITY OFFER</TITLE>\r\n" + 
				"<AUTHOR>    by Janie Gabbett, Reuters</AUTHOR>\r\n" + 
				"<DATELINE>    LOS ANGELES, Feb 26 - </DATELINE><BODY>BankAmerica Corp is not under\r\n" + 
				"pressure to act quickly on its proposed equity offering and\r\n" + 
				"would do well to delay it because of the stock's recent poor\r\n" + 
				"performance, banking analysts said.\r\n" + 
				"    Some analysts said they have recommended BankAmerica delay\r\n" + 
				"its up to one-billion-dlr equity offering, which has yet to be\r\n" + 
				"approved by the Securities and Exchange Commission.\r\n" + 
				"    BankAmerica stock fell this week, along with other banking\r\n" + 
				"issues, on the news that Brazil has suspended interest payments\r\n" + 
				"on a large portion of its foreign debt.\r\n" + 
				"    The stock traded around 12, down 1/8, this afternoon,\r\n" + 
				"after falling to 11-1/2 earlier this week on the news.\r\n" + 
				"    Banking analysts said that with the immediate threat of the\r\n" + 
				"First Interstate Bancorp &lt;I> takeover bid gone, BankAmerica is\r\n" + 
				"under no pressure to sell the securities into a market that\r\n" + 
				"will be nervous on bank stocks in the near term.\r\n" + 
				"    BankAmerica filed the offer on January 26. It was seen as\r\n" + 
				"one of the major factors leading the First Interstate\r\n" + 
				"withdrawing its takeover bid on February 9.\r\n" + 
				"    A BankAmerica spokesman said SEC approval is taking longer\r\n" + 
				"than expected and market conditions must now be re-evaluated.\r\n" + 
				"    \"The circumstances at the time will determine what we do,\"\r\n" + 
				"said Arthur Miller, BankAmerica's Vice President for Financial\r\n" + 
				"Communications, when asked if BankAmerica would proceed with\r\n" + 
				"the offer immediately after it receives SEC approval.\r\n" + 
				"    \"I'd put it off as long as they conceivably could,\" said\r\n" + 
				"Lawrence Cohn, analyst with Merrill Lynch, Pierce, Fenner and\r\n" + 
				"Smith.\r\n" + 
				"    Cohn said the longer BankAmerica waits, the longer they\r\n" + 
				"have to show the market an improved financial outlook.\r\n" + 
				"    Although BankAmerica has yet to specify the types of\r\n" + 
				"equities it would offer, most analysts believed a convertible\r\n" + 
				"preferred stock would encompass at least part of it.\r\n" + 
				"    Such an offering at a depressed stock price would mean a\r\n" + 
				"lower conversion price and more dilution to BankAmerica stock\r\n" + 
				"holders, noted Daniel Williams, analyst with Sutro Group.\r\n" + 
				"    Several analysts said that while they believe the Brazilian\r\n" + 
				"debt problem will continue to hang over the banking industry\r\n" + 
				"through the quarter, the initial shock reaction is likely to\r\n" + 
				"ease over the coming weeks.\r\n" + 
				"    Nevertheless, BankAmerica, which holds about 2.70 billion\r\n" + 
				"dlrs in Brazilian loans, stands to lose 15-20 mln dlrs if the\r\n" + 
				"interest rate is reduced on the debt, and as much as 200 mln\r\n" + 
				"dlrs if Brazil pays no interest for a year, said Joseph\r\n" + 
				"Arsenio, analyst with Birr, Wilson and Co.\r\n" + 
				"    He noted, however, that any potential losses would not show\r\n" + 
				"up in the current quarter.\r\n" + 
				"    With other major banks standing to lose even more than\r\n" + 
				"BankAmerica if Brazil fails to service its debt, the analysts\r\n" + 
				"said they expect the debt will be restructured, similar to way\r\n" + 
				"Mexico's debt was, minimizing losses to the creditor banks.\r\n" + 
				" Reuter\r\n" + 
				" </BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"YES\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5548\" NEWID=\"5\">\r\n" + 
				"<DATE>26-FEB-1987 15:10:44.60</DATE>\r\n" + 
				"<TOPICS><D>grain</D><D>wheat</D><D>corn</D><D>barley</D><D>oat</D><D>sorghum</D></TOPICS>\r\n" + 
				"<PLACES><D>usa</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"   C G\r\n" + 
				"   f0738 reute\r\n" + 
				"u f BC-average-prices   02-26 0095</UNKNOWN>\r\n" + 
				"<TEXT> \r\n" + 
				"<TITLE>NATIONAL AVERAGE PRICES FOR FARMER-OWNED RESERVE</TITLE>\r\n" + 
				"<DATELINE>    WASHINGTON, Feb 26 - </DATELINE><BODY>The U.S. Agriculture Department\r\n" + 
				"reported the farmer-owned reserve national five-day average\r\n" + 
				"price through February 25 as follows (Dlrs/Bu-Sorghum Cwt) -\r\n" + 
				"         Natl   Loan           Release   Call\r\n" + 
				"         Avge   Rate-X  Level    Price  Price\r\n" + 
				" Wheat   2.55   2.40       IV     4.65     --\r\n" + 
				"                            V     4.65     --\r\n" + 
				"                           VI     4.45     --\r\n" + 
				" Corn    1.35   1.92       IV     3.15   3.15\r\n" + 
				"                            V     3.25     --\r\n" + 
				" X - 1986 Rates.\r\n" + 
				"\r\n" + 
				"          Natl   Loan          Release   Call\r\n" + 
				"          Avge   Rate-X  Level   Price  Price\r\n" + 
				" Oats     1.24   0.99        V    1.65    -- \r\n" + 
				" Barley   n.a.   1.56       IV    2.55   2.55\r\n" + 
				"                             V    2.65    -- \r\n" + 
				" Sorghum  2.34   3.25-Y     IV    5.36   5.36\r\n" + 
				"                             V    5.54    -- \r\n" + 
				"    Reserves I, II and III have matured. Level IV reflects\r\n" + 
				"grain entered after Oct 6, 1981 for feedgrain and after July\r\n" + 
				"23, 1981 for wheat. Level V wheat/barley after 5/14/82,\r\n" + 
				"corn/sorghum after 7/1/82. Level VI covers wheat entered after\r\n" + 
				"January 19, 1984.  X-1986 rates. Y-dlrs per CWT (100 lbs).\r\n" + 
				"n.a.-not available.\r\n" + 
				" Reuter\r\n" + 
				" </BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"YES\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5549\" NEWID=\"6\">\r\n" + 
				"<DATE>26-FEB-1987 15:14:36.41</DATE>\r\n" + 
				"<TOPICS><D>veg-oil</D><D>linseed</D><D>lin-oil</D><D>soy-oil</D><D>sun-oil</D><D>soybean</D><D>oilseed</D><D>corn</D><D>sunseed</D><D>grain</D><D>sorghum</D><D>wheat</D></TOPICS>\r\n" + 
				"<PLACES><D>argentina</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"   G\r\n" + 
				"   f0754 reute\r\n" + 
				"r f BC-ARGENTINE-1986/87-GRA   02-26 0066</UNKNOWN>\r\n" + 
				"<TEXT> \r\n" + 
				"<TITLE>ARGENTINE 1986/87 GRAIN/OILSEED REGISTRATIONS</TITLE>\r\n" + 
				"<DATELINE>    BUENOS AIRES, Feb 26 - </DATELINE><BODY>Argentine grain board figures show\r\n" + 
				"crop registrations of grains, oilseeds and their products to\r\n" + 
				"February 11, in thousands of tonnes, showing those for futurE\r\n" + 
				"shipments month, 1986/87 total and 1985/86 total to February\r\n" + 
				"12, 1986, in brackets:\r\n" + 
				"    Bread wheat prev 1,655.8, Feb 872.0, March 164.6, total\r\n" + 
				"2,692.4 (4,161.0).\r\n" + 
				"    Maize Mar 48.0, total 48.0 (nil).\r\n" + 
				"    Sorghum nil (nil)\r\n" + 
				"    Oilseed export registrations were:\r\n" + 
				"    Sunflowerseed total 15.0 (7.9)\r\n" + 
				"    Soybean May 20.0, total 20.0 (nil)\r\n" + 
				"    The board also detailed export registrations for\r\n" + 
				"subproducts, as follows,\r\n" + 
				"    SUBPRODUCTS\r\n" + 
				"    Wheat prev 39.9, Feb 48.7, March 13.2, Apr 10.0, total\r\n" + 
				"111.8 (82.7) .\r\n" + 
				"    Linseed prev 34.8, Feb 32.9, Mar 6.8, Apr 6.3, total 80.8\r\n" + 
				"(87.4).\r\n" + 
				"    Soybean prev 100.9, Feb 45.1, MAr nil, Apr nil, May 20.0,\r\n" + 
				"total 166.1 (218.5).\r\n" + 
				"    Sunflowerseed prev 48.6, Feb 61.5, Mar 25.1, Apr 14.5,\r\n" + 
				"total 149.8 (145.3).\r\n" + 
				"    Vegetable oil registrations were :         \r\n" + 
				"    Sunoil prev 37.4, Feb 107.3, Mar 24.5, Apr 3.2, May nil,\r\n" + 
				"Jun 10.0, total 182.4 (117.6).                  \r\n" + 
				"    Linoil prev 15.9, Feb 23.6, Mar 20.4, Apr 2.0, total 61.8,\r\n" + 
				"(76.1).                         \r\n" + 
				"    Soybean oil prev 3.7, Feb 21.1, Mar nil, Apr 2.0, May 9.0,\r\n" + 
				"Jun 13.0, Jul 7.0, total 55.8 (33.7).        REUTER\r\n" + 
				" </BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"NO\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5550\" NEWID=\"7\">\r\n" + 
				"<DATE>26-FEB-1987 15:14:42.83</DATE>\r\n" + 
				"<TOPICS></TOPICS>\r\n" + 
				"<PLACES><D>usa</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"   F\r\n" + 
				"   f0755 reute\r\n" + 
				"d f BC-RED-LION-INNS-FILES-P   02-26 0082</UNKNOWN>\r\n" + 
				"<TEXT> \r\n" + 
				"<TITLE>RED LION INNS FILES PLANS OFFERING</TITLE>\r\n" + 
				"<DATELINE>    PORTLAND, Ore., Feb 26 - </DATELINE><BODY>Red Lion Inns Limited Partnership\r\n" + 
				"said it filed a registration statement with the Securities and\r\n" + 
				"Exchange Commission covering a proposed offering of 4,790,000\r\n" + 
				"units of limited partnership interests.\r\n" + 
				"    The company said it expects the offering to be priced at 20\r\n" + 
				"dlrs per unit.\r\n" + 
				"    It said proceeds from the offering, along with a 102.5 mln\r\n" + 
				"dlr mortgage loan, will be used to finance its planned\r\n" + 
				"acquisition of 10 Red Lion hotels.\r\n" + 
				" Reuter\r\n" + 
				" </BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"YES\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5551\" NEWID=\"8\">\r\n" + 
				"<DATE>26-FEB-1987 15:15:40.12</DATE>\r\n" + 
				"<TOPICS></TOPICS>\r\n" + 
				"<PLACES><D>usa</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"   F A RM\r\n" + 
				"   f0758 reute\r\n" + 
				"u f BC-USX-&lt;X>-DEBT-DOWGRADE   02-26 0103</UNKNOWN>\r\n" + 
				"<TEXT> \r\n" + 
				"<TITLE>USX &lt;X> DEBT DOWGRADED BY MOODY'S</TITLE>\r\n" + 
				"<DATELINE>    NEW YORK, Feb 26 - </DATELINE><BODY>Moody's Investors Service Inc said it\r\n" + 
				"lowered the debt and preferred stock ratings of USX Corp and\r\n" + 
				"its units. About seven billion dlrs of securities is affected.\r\n" + 
				"    Moody's said Marathon Oil Co's recent establishment of up\r\n" + 
				"to one billion dlrs in production payment facilities on its\r\n" + 
				"prolific Yates Field has significant negative implications for\r\n" + 
				"USX's unsecured creditors.\r\n" + 
				"    The company appears to have positioned its steel segment\r\n" + 
				"for a return to profit by late 1987, Moody's added.\r\n" + 
				"    Ratings lowered include those on USX's senior debt to BA-1\r\n" + 
				"from BAA-3.\r\n" + 
				" Reuter\r\n" + 
				" </BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"YES\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5552\" NEWID=\"9\">\r\n" + 
				"<DATE>26-FEB-1987 15:17:11.20</DATE>\r\n" + 
				"<TOPICS><D>earn</D></TOPICS>\r\n" + 
				"<PLACES><D>usa</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"   F\r\n" + 
				"   f0762 reute\r\n" + 
				"r f BC-CHAMPION-PRODUCTS-&lt;CH   02-26 0067</UNKNOWN>\r\n" + 
				"<TEXT> \r\n" + 
				"<TITLE>CHAMPION PRODUCTS &lt;CH> APPROVES STOCK SPLIT</TITLE>\r\n" + 
				"<DATELINE>    ROCHESTER, N.Y., Feb 26 - </DATELINE><BODY>Champion Products Inc said its\r\n" + 
				"board of directors approved a two-for-one stock split of its\r\n" + 
				"common shares for shareholders of record as of April 1, 1987.\r\n" + 
				"    The company also said its board voted to recommend to\r\n" + 
				"shareholders at the annual meeting April 23 an increase in the\r\n" + 
				"authorized capital stock from five mln to 25 mln shares.\r\n" + 
				" Reuter\r\n" + 
				" </BODY></TEXT>\r\n" + 
				"</REUTERS>\r\n" + 
				"<REUTERS TOPICS=\"YES\" LEWISSPLIT=\"TRAIN\" CGISPLIT=\"TRAINING-SET\" OLDID=\"5553\" NEWID=\"10\">\r\n" + 
				"<DATE>26-FEB-1987 15:18:06.67</DATE>\r\n" + 
				"<TOPICS><D>acq</D></TOPICS>\r\n" + 
				"<PLACES><D>usa</D></PLACES>\r\n" + 
				"<PEOPLE></PEOPLE>\r\n" + 
				"<ORGS></ORGS>\r\n" + 
				"<EXCHANGES></EXCHANGES>\r\n" + 
				"<COMPANIES></COMPANIES>\r\n" + 
				"<UNKNOWN> \r\n" + 
				"";
		parser prser = new parser();
		prser.parser(str2);
	
		
	}	
	
}


