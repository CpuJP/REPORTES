package com.project.reportes.reports.controller;

import com.project.reportes.reports.enums.TipoReporteEnum;
import com.project.reportes.reports.model.ReporteJasperDTO;
import com.project.reportes.reports.service.api.ReporteJasperServiceAPI;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@PreAuthorize("hasAnyRole('ADMIN', 'BIENS', 'BIBLIO', 'SALC', 'LABT', 'CAMP')")
@RequestMapping("/report")
public class ReporteJasperController {

	@Autowired
	private ReporteJasperServiceAPI reporteJasperServiceAPI;

	@GetMapping(path = "/biblioteca/estudiante/download")
	public ResponseEntity<Resource> downloadEstudianteBiblioteca(@RequestParam Map<String, Object> params)
			throws JRException, IOException, SQLException {
		ReporteJasperDTO dto = reporteJasperServiceAPI.obtenerReporteEstudiantesBiblioteca(params);

		InputStreamResource streamResource = new InputStreamResource(dto.getStream());
		MediaType mediaType = null;
		if (params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name())) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM;
		} else {
			mediaType = MediaType.APPLICATION_PDF;
		}

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + dto.getFileName() + "\"")
				.contentLength(dto.getLength()).contentType(mediaType).body(streamResource);
	}

	@GetMapping(path = "/biblioteca/docente/download")
	public ResponseEntity<Resource> downloadDocenteBiblioteca(@RequestParam Map<String, Object> params)
			throws JRException, IOException, SQLException {
		ReporteJasperDTO dto = reporteJasperServiceAPI.obtenerReporteDocentesBiblioteca(params);

		InputStreamResource streamResource = new InputStreamResource(dto.getStream());
		MediaType mediaType = null;
		if (params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name())) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM;
		} else {
			mediaType = MediaType.APPLICATION_PDF;
		}

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + dto.getFileName() + "\"")
				.contentLength(dto.getLength()).contentType(mediaType).body(streamResource);
	}

	@GetMapping(path = "/campus/estudiante/download")
	public ResponseEntity<Resource> downloadEstudianteCampus(@RequestParam Map<String, Object> params)
			throws JRException, IOException, SQLException {
		ReporteJasperDTO dto = reporteJasperServiceAPI.obtenerReporteEstudianteCampus(params);

		InputStreamResource streamResource = new InputStreamResource(dto.getStream());
		MediaType mediaType = null;
		if (params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name())) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM;
		} else {
			mediaType = MediaType.APPLICATION_PDF;
		}

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + dto.getFileName() + "\"")
				.contentLength(dto.getLength()).contentType(mediaType).body(streamResource);
	}

	@GetMapping(path = "/campus/docente/download")
	public ResponseEntity<Resource> downloadDocenteCampus(@RequestParam Map<String, Object> params)
			throws JRException, IOException, SQLException {
		ReporteJasperDTO dto = reporteJasperServiceAPI.obtenerReporteDocenteCampus(params);

		InputStreamResource streamResource = new InputStreamResource(dto.getStream());
		MediaType mediaType = null;
		if (params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name())) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM;
		} else {
			mediaType = MediaType.APPLICATION_PDF;
		}

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + dto.getFileName() + "\"")
				.contentLength(dto.getLength()).contentType(mediaType).body(streamResource);
	}

	@GetMapping(path = "/campus/egresado/download")
	public ResponseEntity<Resource> downloadEgresadoCampus(@RequestParam Map<String, Object> params)
			throws JRException, IOException, SQLException {
		ReporteJasperDTO dto = reporteJasperServiceAPI.obtenerReporteEgresadoCampus(params);

		InputStreamResource streamResource = new InputStreamResource(dto.getStream());
		MediaType mediaType = null;
		if (params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name())) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM;
		} else {
			mediaType = MediaType.APPLICATION_PDF;
		}

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + dto.getFileName() + "\"")
				.contentLength(dto.getLength()).contentType(mediaType).body(streamResource);
	}

	@GetMapping(path = "/salacomputo/estudiante/download")
	public ResponseEntity<Resource> downloadEstudianteSalaComputo(@RequestParam Map<String, Object> params)
			throws JRException, IOException, SQLException {
		ReporteJasperDTO dto = reporteJasperServiceAPI.obtenerReporteEstudianteSalaComputo(params);

		InputStreamResource streamResource = new InputStreamResource(dto.getStream());
		MediaType mediaType = null;
		if (params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name())) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM;
		} else {
			mediaType = MediaType.APPLICATION_PDF;
		}

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + dto.getFileName() + "\"")
				.contentLength(dto.getLength()).contentType(mediaType).body(streamResource);
	}

	@GetMapping(path = "/laboratorio/estudiante/download")
	public ResponseEntity<Resource> downloadEstudianteLaboratorio(@RequestParam Map<String, Object> params)
			throws JRException, IOException, SQLException {
		ReporteJasperDTO dto = reporteJasperServiceAPI.obtenerReporteEstudianteLaboratorio(params);

		InputStreamResource streamResource = new InputStreamResource(dto.getStream());
		MediaType mediaType = null;
		if (params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name())) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM;
		} else {
			mediaType = MediaType.APPLICATION_PDF;
		}

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + dto.getFileName() + "\"")
				.contentLength(dto.getLength()).contentType(mediaType).body(streamResource);
	}
}
