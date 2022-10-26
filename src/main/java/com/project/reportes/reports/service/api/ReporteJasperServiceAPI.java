package com.project.reportes.reports.service.api;

import com.project.reportes.reports.model.ReporteJasperDTO;
import net.sf.jasperreports.engine.JRException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public interface ReporteJasperServiceAPI {
	ReporteJasperDTO obtenerReporteEstudiantesBiblioteca(Map<String, Object> params) throws JRException, IOException, SQLException;

	ReporteJasperDTO obtenerReporteDocentesBiblioteca(Map<String, Object> params) throws JRException, IOException, SQLException;

	ReporteJasperDTO obtenerReporteEstudianteCampus(Map<String, Object> params) throws JRException, IOException, SQLException;

	ReporteJasperDTO obtenerReporteDocenteCampus(Map<String, Object> params) throws JRException, IOException, SQLException;

	ReporteJasperDTO obtenerReporteEgresadoCampus(Map<String, Object> params) throws JRException, IOException, SQLException;

	ReporteJasperDTO obtenerReporteEstudianteSalaComputo(Map<String, Object> params) throws JRException, IOException, SQLException;

}
