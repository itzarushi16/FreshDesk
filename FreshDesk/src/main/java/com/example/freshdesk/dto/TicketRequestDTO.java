package com.example.freshdesk.dto;

public class TicketRequestDTO {

    private String subject;
    private String description;
    private String email;
    private Integer priority;
    private Integer status;
    private String type;

    public TicketRequestDTO() {}

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) { this.priority = priority; }

    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
