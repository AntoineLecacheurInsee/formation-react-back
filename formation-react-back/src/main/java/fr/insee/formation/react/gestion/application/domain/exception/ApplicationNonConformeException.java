package fr.insee.formation.react.gestion.application.domain.exception;

public class ApplicationNonConformeException extends Exception {
    public ApplicationNonConformeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationNonConformeException(String message) {
        super(message);
    }
}
