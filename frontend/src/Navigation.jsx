function Navigation({ sections, activeSection, onNavigate }) {
  return (
    <nav className="navbar navbar-expand bg-body-tertiary mb-4">
      <div className="container">
        <span className="navbar-brand">Carpenter Business Name</span>
        <ul className="navbar-nav">
          {sections.map(({ key, label }) => (
            <li className="nav-item" key={key}>
              <button
                type="button"
                className={`nav-link btn btn-link${key === activeSection ? ' active' : ''}`}
                onClick={() => onNavigate(key)}
              >
                {label}
              </button>
            </li>
          ))}
        </ul>
      </div>
    </nav>
  )
}

export default Navigation
