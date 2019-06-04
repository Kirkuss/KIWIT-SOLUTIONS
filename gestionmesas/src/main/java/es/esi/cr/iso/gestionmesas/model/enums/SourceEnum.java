package es.esi.cr.iso.gestionmesas.model.enums;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

import org.springframework.util.CollectionUtils;

public enum SourceEnum {

	WEB_APP(1, SourceConcernEnum.APPLICATION, "Web application", Arrays.asList("ear", "war", "jar")), JPA(1,
			SourceConcernEnum.APPLICATION, "JPA config");

	private int identificator;
	private SourceConcernEnum sourceConcern;
	private String label;
	private List<String> extensions;

	private SourceEnum(int identificator, SourceConcernEnum sourceConcern, String label) {
		this(identificator, sourceConcern, label, null);
	}

	private SourceEnum(int identificator, SourceConcernEnum sourceConcern, String label, List<String> extensions) {
		this.identificator = identificator;
		this.sourceConcern = sourceConcern;
		this.label = label;
		this.extensions = extensions;
	}

	public int getId() {
		return identificator;
	}

	public String getLabel() {
		return label;
	}

	public SourceConcernEnum getSourceConcern() {
		return sourceConcern;
	}

	public List<String> getExtensions() {
		return extensions;
	}

	public String getFormattedExtensions() {
		return CollectionUtils.isEmpty(extensions) ? "" : extensions.stream().collect(joining(", *.", "(*.", ")"));
	}

}
