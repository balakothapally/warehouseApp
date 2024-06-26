package com.app.util;

import java.io.File;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class WhUserTypeUtil {
	
	
	public void generatePie(String path,List<Object[]>data) {

		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] ob:data) {
			dataset.setValue(ob[0].toString(), new Double(ob[1].toString()));
		}
		JFreeChart chart=ChartFactory.createPieChart3D("uom type", dataset,true,true,false);
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/userA.jpg"), chart, 400,400);

		} catch (Exception e) {

			e.printStackTrace();
		}

}
	public void generateBar(String path,List<Object[]>data) {
		DefaultCategoryDataset dataset= new DefaultCategoryDataset();
		for(Object[] ob: data) {
			dataset.setValue(new Double(ob[1].toString()),ob[0].toString(),"");
		}
		JFreeChart chart=ChartFactory.createBarChart("user type reports","mode","count", dataset,PlotOrientation.VERTICAL,true,true,false);
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/userB.jpg"), chart, 400,400);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}