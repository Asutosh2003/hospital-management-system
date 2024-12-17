<nav class="navbar navbar-expand-lg navbar-dark bg-body-success bg-success">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><i class="fas fa-hospital-user"></i>MEDCARE</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">DOCTOR</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Patient</a>
        </li>
      </ul>
      
      <!-- Right-aligned dropdown -->
      <ul class="navbar-nav ms-auto"> <!-- Ensure this pushes items to the right -->
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Admin
          </a>
          <ul class="dropdown-menu dropdown-menu-end"> <!-- Aligns the dropdown to the right side -->
            <li><a class="dropdown-item" href="logout.jsp">Logout</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
