package com.company.mttest.entity;

import com.haulmont.addon.sdbmt.core.TenantId;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.TenantEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "MTTEST_STORE")
@Entity(name = "mttest_Store")
public class Store extends StandardEntity implements TenantEntity {
    private static final long serialVersionUID = -8165804986120985705L;

    @NotNull
    @Column(name = "CODE", nullable = false, length = 30)
    @NotBlank
    @Size(min = 1, max = 30)
    private String code;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    @NotBlank
    @Size(min = 1, max = 100)
    private String name;

    @TenantId
    @Column(name = "TENANT_ID")
    private String tenantId;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}