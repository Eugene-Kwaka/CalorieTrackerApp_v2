//package com.eugene.repositories;
//
//import com.eugene.models.CalorieTrack;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface CalorieTrackRepo extends JpaRepository<CalorieTrack, Long> {
//    Optional<CalorieTrack> findById(Long cId);
//
//    @Query("""
//            select ct from CalorieTrack ct
//            inner join fetch ct.user u
//            inner join fetch ct.food f
//            where u.uId = :uId
//            order by ct.cId
//            """)
//    List<CalorieTrack> findAllByUser_uId(@Param("uId") Long uId);
//
//    @Query("""
//            select ct from CalorieTrack ct
//            inner join fetch ct.user u
//            inner join fetch ct.food f
//            where u.uId = :uId and ct.logDate = :logDate
//            order by ct.cId
//            """)
//    List<CalorieTrack> findAllByUser_uIdAndLogDate(@Param("uId") Long uId, @Param("logDate") LocalDate logDate);
//
//    @Query("""
//            select ct from CalorieTrack ct
//            inner join fetch ct.user u
//            inner join fetch ct.food f
//            where u.uId = :uId and ct.logDate between :logDateStart and :logDateEnd
//            order by ct.cId
//            """)
//    List<CalorieTrack> findAllByUser_uIdAndLogDateBetween(
//            @Param("uId") Long uId,
//            @Param("logDateStart") LocalDate logDateStart,
//            @Param("logDateEnd") LocalDate logDateEnd);
//
//}
