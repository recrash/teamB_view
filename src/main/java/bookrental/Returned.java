package bookrental;

import java.util.Date;

public class Returned extends AbstractEvent {

    private Long id;
    private Long bookId;
    private Long blurayId;
    private Long userId;
    private Date rentalDate;
    private Date expiredDate;
    private Date returnDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }
    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Long getBlurayId() {
        return blurayId;
    }

    public void setBlurayId(Long blurayId) {
        this.blurayId = blurayId;
    }
}
