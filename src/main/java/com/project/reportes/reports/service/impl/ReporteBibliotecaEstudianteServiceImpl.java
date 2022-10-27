package com.project.reportes.reports.service.impl;

import com.project.reportes.reports.commons.JasperReportManager;
import com.project.reportes.reports.enums.TipoReporteEnum;
import com.project.reportes.reports.model.ReporteJasperDTO;
import com.project.reportes.reports.service.api.ReporteJasperServiceAPI;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

@Service
public class ReporteBibliotecaEstudianteServiceImpl implements ReporteJasperServiceAPI {

	@Autowired
	private JasperReportManager reportManager;

	@Autowired
	private DataSource dataSource;

	@Override
	public ReporteJasperDTO obtenerReporteEstudiantesBiblioteca(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "reporte_ingreso_biblioteca_estudiante";
		ReporteJasperDTO dto = new ReporteJasperDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}

	@Override
	public ReporteJasperDTO obtenerReporteDocentesBiblioteca(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "docente_biblioteca";
		ReporteJasperDTO dto = new ReporteJasperDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}

	@Override
	public ReporteJasperDTO obtenerReporteEstudianteCampus(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "Estudiante_Ingreso";
		ReporteJasperDTO dto = new ReporteJasperDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}

	@Override
	public ReporteJasperDTO obtenerReporteDocenteCampus(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "Docente_Ingreso_Campus";
		ReporteJasperDTO dto = new ReporteJasperDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}


	@Override
	public ReporteJasperDTO obtenerReporteEgresadoCampus(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "egresados_campus";
		ReporteJasperDTO dto = new ReporteJasperDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}


	@Override
	public ReporteJasperDTO obtenerReporteEstudianteSalaComputo(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "estudiantes_sala_computo";
		ReporteJasperDTO dto = new ReporteJasperDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}

	@Override
	public ReporteJasperDTO obtenerReporteEstudianteLaboratorio(Map<String, Object> params)
			throws JRException, IOException, SQLException {
		String fileName = "laboratorio";
		ReporteJasperDTO dto = new ReporteJasperDTO();
		String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx"
				: ".pdf";
		dto.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		dto.setStream(new ByteArrayInputStream(bs));
		dto.setLength(bs.length);

		return dto;
	}
}

