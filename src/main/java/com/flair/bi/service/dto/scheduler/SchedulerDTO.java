package com.flair.bi.service.dto.scheduler;
import com.project.bi.query.dto.QueryDTO;

public class SchedulerDTO {

	private String userid;
	private String cron_exp;
	private long datasourceid;
	private String visualizationid;
	private ReportDTO report;
	private ReportLineItem report_line_item;
	private AssignReport assign_report;
	private Schedule schedule;
	private QueryDTO queryDTO;
	
	public SchedulerDTO(){}
	
	public SchedulerDTO(String userid, String cron_exp, long datasourceid, String visualizationid, ReportDTO report,
			ReportLineItem report_line_item, AssignReport assign_report, Schedule schedule, QueryDTO queryDTO) {
		super();
		this.userid = userid;
		this.cron_exp = cron_exp;
		this.datasourceid = datasourceid;
		this.visualizationid = visualizationid;
		this.report = report;
		this.report_line_item = report_line_item;
		this.assign_report = assign_report;
		this.schedule = schedule;
		this.queryDTO = queryDTO;
	}



	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public ReportDTO getReport() {
		return report;
	}

	public void setReport(ReportDTO report) {
		this.report = report;
	}

	public ReportLineItem getReport_line_item() {
		return report_line_item;
	}

	public void setReport_line_item(ReportLineItem report_line_item) {
		this.report_line_item = report_line_item;
	}

	public AssignReport getAssign_report() {
		return assign_report;
	}

	public void setAssign_report(AssignReport assign_report) {
		this.assign_report = assign_report;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public String getCron_exp() {
		return cron_exp;
	}

	public void setCron_exp(String cron_exp) {
		this.cron_exp = cron_exp;
	}
	
	public String getVisualizationid() {
		return visualizationid;
	}

	public void setVisualizationid(String visualizationid) {
		this.visualizationid = visualizationid;
	}
	
	
	public long getDatasourceid() {
		return datasourceid;
	}

	public void setDatasourceid(long datasourceid) {
		this.datasourceid = datasourceid;
	}

	public QueryDTO getQueryDTO() {
		return queryDTO;
	}

	public void setQueryDTO(QueryDTO queryDTO) {
		this.queryDTO = queryDTO;
	}

	@Override
	public String toString() {
		return "SchedulerDTO [userid=" + userid + ", cron_exp=" + cron_exp + ", datasourceid=" + datasourceid
				+ ", visualizationid=" + visualizationid + ", report=" + report + ", report_line_item="
				+ report_line_item + ", assign_report=" + assign_report + ", schedule=" + schedule + ", queryDTO="
				+ queryDTO + "]";
	}
	
	
}
