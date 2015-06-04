package webservice.response;

import java.util.List;

public class MoviesResponse {
	private Pagination pagination;
	private List<Movie> movies;
	
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	@Override
	public String toString() {
		return "MoviesResponse [pagination=" + pagination + "]";
	}

	public static class Movie {
		
	}
	
	public static class Pagination {
	    private Long count;
	    private Integer page;
	    private Integer total_pages;
	    
		@Override
		public String toString() {
			return "Pagination [count=" + count + ", page=" + page
					+ ", total_pages=" + total_pages + "]";
		}
		public Long getCount() {
			return count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Integer getPage() {
			return page;
		}
		public void setPage(Integer page) {
			this.page = page;
		}
		public Integer getTotal_pages() {
			return total_pages;
		}
		public void setTotal_pages(Integer total_pages) {
			this.total_pages = total_pages;
		}
	}
}
