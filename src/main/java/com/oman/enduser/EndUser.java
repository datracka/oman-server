package com.oman.enduser;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import com.oman.campaign.Campaign;
import com.oman.settings.Settings;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "enduser")
public class EndUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @GeneratedValue(generator = "UUID")
    private UUID uuid;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Campaign> campaign;

    @OneToOne(mappedBy = "enduser")
    private Settings settings;

}
