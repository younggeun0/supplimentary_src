package example0112;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import example0112.connection.GetConnetion;


public class LottoEvtDAO {
	private static LottoEvtDAO le_dao;
	
	public static LottoEvtDAO getInstance() {
		if(le_dao==null) {
			le_dao = new LottoEvtDAO();
		}//end if
		return le_dao;
	}//getInstance
	
	public List<LottoVO> selectLotto() throws SQLException{
		List<LottoVO> list = new ArrayList<LottoVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id ="scott";
			String pass = "tiger";
			con = GetConnetion.getInstance().getConn(url, id, pass);
			String selectLotto ="select times,to_char(event_date,'yyyy-mm-dd') event_date"
					+ ",amount,winner_count, num1,num2,num3,"
					+ "num4,num5,num6,num7 from lotto";
			pstmt = con.prepareStatement(selectLotto);
			rs = pstmt.executeQuery();
			
			LottoVO lv = null;
			while(rs.next()) {
				lv = new LottoVO(rs.getInt("times"),rs.getString("event_date"),
						rs.getInt("winner_count"),rs.getString("amount"),
						rs.getInt("num1"),rs.getInt("num2"),rs.getInt("num3"),rs.getInt("num4"),
						rs.getInt("num5"),rs.getInt("num6"),rs.getInt("num7")
						);
				list.add(lv);
			}
//			System.out.println(list);
			return list;
			
		}finally {
			//////////////////////////////////////////rs 안끊음 ///////////////////////////////////////////////
			if(pstmt!=null) {pstmt.close();}
			if(con!=null) {con.close();}
		}
			
	}
	/////////////////////////////////// 단위테스트 끝나면 main함수 삭제 //////////////////////////////////////////
	public static void main(String[] args) {
		LottoEvtDAO le_dao = new LottoEvtDAO();
		try {
			System.out.println(le_dao.selectLotto());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
