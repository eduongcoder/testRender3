// package com.example.demo.entity;

// import java.time.LocalDateTime;

// import jakarta.persistence.EmbeddedId;
// import jakarta.persistence.Entity;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.MapsId;
// import lombok.AccessLevel;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// import lombok.experimental.FieldDefaults;

// @Entity
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @FieldDefaults(level = AccessLevel.PRIVATE)
// public class HistoryRead {

// 	@EmbeddedId
// 	private HistoryId id;

// 	@ManyToOne
// 	@MapsId("idUser")
// 	@JoinColumn(name = "id_User", nullable = false)
// 	private User user; 

// 	@ManyToOne
// 	@MapsId("idChapter")
// 	@JoinColumn(name = "id_Chapter", nullable = false)
// 	private Chapter chapter;

// 	private LocalDateTime readingTime;
// }
