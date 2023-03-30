package com.oman.enduser;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import com.oman.campaign.Campaign;
import com.oman.setting.Setting;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "enduser")
public class EndUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String userName;
    @NonNull
    private String email;
    @NonNull
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    /*
     * @OneToMany(cascade = CascadeType.ALL)
     * 
     * @JoinColumn(name = "enduser_id")
     * private Set<Campaign> campaign;
     */

    @OneToOne(mappedBy = "enduser")
    private Setting setting;

}
