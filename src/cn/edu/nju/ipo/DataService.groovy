package cn.edu.nju.ipo

import cn.edu.nju.ipo.dao.InvestorDao
import cn.edu.nju.ipo.dao.PrivateFirmDao
import cn.edu.nju.ipo.dao.PublicFirmDao

abstract class DataService {
	public static InvestorDao getInvestorDao(){return new InvestorDao();}
	public static PrivateFirmDao getPrivateFirmDao(){return new PrivateFirmDao();}
	public static PublicFirmDao getPublicFirmDao(){return new PublicFirmDao();}
}
