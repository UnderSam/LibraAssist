package com.writerwriter.libraassist;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LibraryInfoDetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_library_info_detail, container, false);

        TextView info = (TextView) v.findViewById(R.id.library_detail_info);
        info.setMovementMethod(new ScrollingMovementMethod());
        info.setTextColor(Color.BLACK);
        info.setTextSize(16);
        Bundle bundle = getArguments();
        if(bundle != null){
            int id = bundle.getInt("id",0);
            switch (id){
                case 0:
                    info.setText("關於本館\n" +
                            "臺北大學圖書館 National Taipei University Library，係臺北大學的圖書資源服務者，眾所期盼的圖書資訊大樓已於 102年 11月 25日正式啟用營運。\n" +
                            "\n" +
                            "    圖書館館藏目前約有42萬冊圖書館藏(含圖書、視聽資料、電子書)、現有紙本期刊290種(不含贈刊)、本校紙本碩博士論文、參考資料等提供館內閱覽。\n" +
                            "    電子資源檢索與使用：\n" +
                            "        「電子資源總覽」(查詢特定資料庫使用)：透過單一介面同時檢索153種資料庫、近6萬種電子期刊等數位館藏。(請參考「圖書館首頁」>「電子資源」項下)。\n" +
                            "        「資源探索服務」：提供類google檢索功能，一鍵搜羅所有校內外相關文獻(含紙本館藏/期刊、資料庫、電子書、校外免費文獻)，快速指引全文獲取途徑。\n" +
                            "        其他電子資源：如本校電子碩博士論文、書目管理軟體(Endnote)、語言學習專區等(請參考「圖書館首頁」>「電子資源」項下各服務)。\n" +
                            "    成員：除館長外，共有 19名館員工，提供圖書專業服務。\n" +
                            "    提供數位化、多元化服務：\n" +
                            "        圖書館網站、自助借書機、門禁系統、圖書資訊系統、空間座位管理系統等。\n" +
                            "        館際互借服務與交流。\n" +
                            "        客製化圖書館服務：導覽、教育訓練等。\n");
                    break;
                case 1:
                    info.setText("開館資訊\n" +
                            "\n" +
                            "發佈館別：新北市圖(總館)\n" +
                            "\n" +
                            "發佈時間： 2017/12/12  | 最後修改時間： 2017/12/12\n" +
                            "\n" +
                            "開放時間：\n" +
                            "\n" +
                            "各館詳細開放時間請點選連結 新北市立圖書館各分館暨圖書閱覽室介紹\n" +
                            "\n" +
                            "休館時間：\n" +
                            "\n" +
                            "經政府公告之國定假日為休館日、每月最後一個星期四為清館日，不對外開放；其他休館日詳見以下「休館日一覽表」。\n" +
                            "\n" +
                            "2017 年 休館日一覽表\n" +
                            "\n" +
                            "板橋車站智慧圖書館春節期間照常開放 7:00-22:00\n" +
                            "日期 \t星期 \t休館日說明\n" +
                            "2017年1月1日 \t日 \t開國紀念日\n" +
                            "2017年1月26日 \t四 \t調整定期休館日(調整開放時間為8:30am-5:00pm)\n" +
                            "2017年1月27日 \t五 \t春節(除夕)\n" +
                            "2017年1月28日 \t六 \t春節(初一)\n" +
                            "2017年1月29日 \t日 \t春節(初二)\n" +
                            "2017年1月30日 \t一 \t春節(初三)\n" +
                            "2017年1月31日 \t二 \t調整開放時間為8:30am-5:00pm\n" +
                            "2017年2月1日 \t三 \t調整開放時間為8:30am-5:00pm\n" +
                            "2017年2月23日 \t四 \t定期休館日\n" +
                            "2017年2月28日 \t二 \t和平紀念日\n" +
                            "2017年3月30日 \t四 \t定期休館日\n" +
                            "2017年4月4日 \t二 \t清明節\n" +
                            "2017年4月27日 \t四 \t定期休館日\n" +
                            "2017年5月25日 \t四 \t定期休館日\n" +
                            "2017年5月30日 \t二 \t端午節\n" +
                            "2017年6月29日 \t四 \t調整開放時間為8:30am-5:00pm\n" +
                            "2017年7月27日 \t四 \t定期休館日\n" +
                            "2017年8月31日 \t四 \t定期休館日\n" +
                            "2017年9月28日 \t四 \t定期休館日\n" +
                            "2017年10月4日 \t三 \t中秋節\n" +
                            "2017年10月10日 \t二 \t國慶日\n" +
                            "2017年10月26日 \t四 \t定期休館日\n" +
                            "2017年11月30日 \t四 \t定期休館日\n" +
                            "2017年12月28日 \t四 \t定期休館日\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "(歡迎下載利用)新北市立圖書館2018休館日日曆檔(ics檔)\n" +
                            "\n" +
                            "2018休館日、調整放假日一覽表\n" +
                            "日期 \t星期 \t休館日說明\n" +
                            "2018年1月1日 \t一 \t開國紀念日\n" +
                            "2018年1月25日 \t四 \t定期休館日\n" +
                            "2018年2月15日 \t四 \t春節(除夕)\n" +
                            "2018年2月16日 \t五 \t春節(初一)\n" +
                            "2018年2月17日 \t六 \t春節(初二)\n" +
                            "2018年2月18日 \t日 \t春節(初三)\n" +
                            "2018年2月19日 \t一 \t調整開放時間至5:00pm\n" +
                            "2018年2月20日 \t二 \t調整開放時間至5:00pm\n" +
                            "2018年2月22日 \t四 \t定期休館日\n" +
                            "2018年2月28日 \t三 \t和平紀念日\n" +
                            "2018年3月29日 \t四 \t定期休館日\n" +
                            "2018年4月4日 \t三 \t兒童節\n" +
                            "2018年4月5日 \t四 \t清明節\n" +
                            "2018年4月26日 \t四 \t定期休館日\n" +
                            "2018年5月31日 \t四 \t定期休館日\n" +
                            "2018年6月18日 \t一 \t端午節\n" +
                            "2018年6月28日 \t四 \t調整開放時間至5:00pm\n" +
                            "2018年7月26日 \t四 \t定期休館日\n" +
                            "2018年8月30日 \t四 \t定期休館日\n" +
                            "2018年9月24日 \t一 \t中秋節\n" +
                            "2018年9月27日 \t四 \t定期休館日\n" +
                            "2018年10月10日 \t三 \t國慶日\n" +
                            "2018年10月25日 \t四 \t定期休館日\n" +
                            "2018年11月29日 \t四 \t定期休館日\n" +
                            "2018年12月27日 \t四 \t定期休館日\n" +
                            "\n" +
                            "依據「新北市立圖書館閱覽服務規則」，各館臨櫃申請借閱證及借、還書在閉館前30分鐘停止受理。");
                    break;
                case 2:
                    info.setText("開館資訊\n" +
                            "開館時間\n" +
                            "\n" +
                            "    週二至週六：8:30-21:00；\n" +
                            "    週日、週一：9:00-17:00。\n" +
                            "\n" +
                            "    申請借閱證、領取預約書、規費繳納及臨櫃借、還書在閉館前30分鐘停止受理。\n" +
                            "\n" +
                            "    總館兒童室開放時間：\n" +
                            "    週二至週六：9:00-18:00；\n" +
                            "    週日、週一：9:00-17:00。\n" +
                            "\n" +
                            "\n" +
                            "    智慧圖書館開放時間：\n" +
                            "    西門智慧圖書館：每日上午6時至晚間12時\n" +
                            "    松山機場智慧圖書館：每日上午6時至晚間12時\n" +
                            "    太陽圖書館：每日上午8時30分至晚間9時\n" +
                            "    百齡智慧圖書館：週一至週五：下午4時30分至9時\n" +
                            "    　　　　　　　　 週六、日及寒暑假：每日上午9時至晚間9時(國定假日不開放)\n" +
                            "    福德智慧圖書館：每日上午9時至晚間9時(國定假日不開放)\n" +
                            "    東區地下街智慧圖書館：每日上午6時至晚間12時\n" +
                            "    古亭智慧圖書館：每日上午9時至晚間9時(國定假日不開放)\n" +
                            "\n" +
                            "\n" +
                            "    啟明分館、柳鄉民眾閱覽室及親子美育數位圖書館開放時間：\n" +
                            "    週一至週日：9:00-17:00。\n" +
                            "\n" +
                            "    公訓圖書站開放時間：\n" +
                            "    一、週一至週五：8：30-17：00（申請借閱證及借、還書服務至16：30）。\n" +
                            "    二、週六、日及國定假日休館。\n" +
                            "\n" +
                            "    士林分館臨時替代館(天文館)開放時間：\n" +
                            "    週二至週日：早上9:00至下午5:00\n" +
                            "    每週一、每月第一個星期四及國定假日固定休館\n" +
                            "\n" +
                            "    在開放時間內可自由進入館內閱覽，6歲以下兒童請由家長陪同。\n" +
                            "\n" +
                            "    經政府公告之放假日為休館日；每月第一個星期四為圖書整理清潔日，不對外開放。\n" +
                            "\n" +
                            "    FastBook全自動借書站及借還書工作站開放時間依設置地點而定。\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "休館日一覽表\n" +
                            "\n" +
                            "    2018-01-01（星期一，開國紀念日）\n" +
                            "    2018-01-04（星期四，休館日）\n" +
                            "    2018-02-01（星期四，休館日）\n" +
                            "    2018-02-15~18（星期四~日，春節）\n" +
                            "    2018-02-28（星期三，二二八紀念日）\n" +
                            "    2018-03-01（星期四，休館日）\n" +
                            "    2018-04-04（星期三，兒童節）\n" +
                            "    2018-04-05（星期四，清明節）\n" +
                            "    2018-05-03（星期四，休館日）\n" +
                            "    2018-06-07（星期四，休館日）\n" +
                            "    2018-06-18（星期一，端午節）\n" +
                            "    2018-07-05（星期四，休館日）\n" +
                            "    2018-08-02（星期四，休館日）\n" +
                            "    2018-09-06（星期四，休館日）\n" +
                            "    2018-09-24（星期一，中秋節）\n" +
                            "    2018-10-04（星期四，休館日）\n" +
                            "    2018-10-10（星期三，國慶日）\n" +
                            "    2018-11-01（星期四，休館日）\n" +
                            "    2018-12-06（星期四，休館日）");
                    break;
            }
        }

        return v;
    }

}
