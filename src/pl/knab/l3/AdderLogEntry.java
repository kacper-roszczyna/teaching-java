package pl.knab.l3;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "adder_log")
@SequenceGenerator(name = "ADDER_SEQ", sequenceName = "adder_log_id_seq", initialValue = 1, allocationSize = 1)
public class AdderLogEntry implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADDER_SEQ")
    private long id;

    private int arg1;

    private int arg2;

    private LocalDateTime createdAt = LocalDateTime.now();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getArg1() {
        return arg1;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdderLogEntry that = (AdderLogEntry) o;
        return id == that.id &&
                arg1 == that.arg1 &&
                arg2 == that.arg2 &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, arg1, arg2, createdAt);
    }
}
